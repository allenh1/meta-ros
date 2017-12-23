# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Parse a multiple poses from yaml and provide as topic and service. This package "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs roscpp visualization-msgs yaml-cpp yocs-msgs"
SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/kinetic/yocs_waypoint_provider/0.8.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "061806dd6401e94d773f825946ba534b"
SRC_URI[sha256sum] = "dedef537750bbe13bf390abb18260f3c5afad44e88c7247fffeee598ab35e7da"
S = "${WORKDIR}/yujin_ocs-release-release-kinetic-yocs_waypoint_provider-0.8.2-0"

inherit catkin
