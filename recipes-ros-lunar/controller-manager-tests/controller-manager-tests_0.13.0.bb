# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "controller_manager_tests"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface controller-manager rostest"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/controller_manager_tests/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0f14f381ad2efe8b243277ac2da41df2"
SRC_URI[sha256sum] = "28eb027005c92e79d719b2bc3865ca51556926c52f71f12683bb09cc195389de"
S = "${WORKDIR}/ros_control-release-release-lunar-controller_manager_tests-0.13.0-0"

inherit catkin
