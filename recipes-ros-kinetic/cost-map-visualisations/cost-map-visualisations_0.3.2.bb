# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Visualisation tools for cost maps."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cost-map-core cost-map-msgs cost-map-ros ecl-build ecl-command-line ecl-console nav-msgs roscpp"
SRC_URI = "https://github.com/stonier/cost_map-release/archive/release/kinetic/cost_map_visualisations/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2b98c9316a997182221e97021d52b49b"
SRC_URI[sha256sum] = "7890e9270b1871e1ecf32ab68599595dc596b5b134aaf4067717865763f7138d"
S = "${WORKDIR}/cost_map-release-release-kinetic-cost_map_visualisations-0.3.2-0"

inherit catkin
