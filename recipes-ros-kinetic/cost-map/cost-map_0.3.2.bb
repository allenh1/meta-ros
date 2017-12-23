# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Meta-package for the universal cost map library."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cost-map-core cost-map-msgs cost-map-ros cost-map-visualisations"
SRC_URI = "https://github.com/stonier/cost_map-release/archive/release/kinetic/cost_map/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ee464212636c1f338203fc4d7d3f3212"
SRC_URI[sha256sum] = "e925fd813733c6b23ac69027912525c8bb8579cf9c2031274d62aadbcc2ea7f5"
S = "${WORKDIR}/cost_map-release-release-kinetic-cost_map-0.3.2-0"

inherit catkin
