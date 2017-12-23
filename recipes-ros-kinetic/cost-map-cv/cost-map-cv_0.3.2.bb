# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Conversions between cost_maps and opencv images."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native cost-map-core libopencv-dev yaml-cpp"
SRC_URI = "https://github.com/stonier/cost_map-release/archive/release/kinetic/cost_map_cv/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "239695131682ce2a2c4d6271ea43e177"
SRC_URI[sha256sum] = "47ed316b05403932952fdf9becf2379bab5c857e582347361b4f748b874d86bc"
S = "${WORKDIR}/cost_map-release-release-kinetic-cost_map_cv-0.3.2-0"

inherit catkin
