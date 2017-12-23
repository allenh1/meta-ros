# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "controller_manager_tests"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface controller-manager rostest"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/kinetic/controller_manager_tests/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "72a925986457c0c9f8f8cc0a85d7b245"
SRC_URI[sha256sum] = "09fa6beb73c111f8de407c086a1e4b45290bdd900f48d3de3b4af80ea49722a7"
S = "${WORKDIR}/ros_control-release-release-kinetic-controller_manager_tests-0.13.0-0"

inherit catkin
