# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Cost maps, following the style of ethz-asl's grid_map library."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native ecl-build ecl-console ecl-eigen grid-map-core"
SRC_URI = "https://github.com/stonier/cost_map-release/archive/release/kinetic/cost_map_core/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "53d09e263db6c05df43d88bb4cf90993"
SRC_URI[sha256sum] = "b594de0cb895f51aa9007aa9d95331c755abd00bd11436ba136519e3bfe96812"
S = "${WORKDIR}/cost_map-release-release-kinetic-cost_map_core-0.3.2-0"

inherit catkin
