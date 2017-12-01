# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "controller_manager_tests"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native controller-interface controller-manager rostest"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/controller_manager_tests/0.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5dbfb2f6615702adad12f69a42067c3e"
SRC_URI[sha256sum] = "4284f4c0ee4fcc294b56e58775ff5021b341dac5d1a11d01cd28c27a59d5697a"
S = "${WORKDIR}/ros_control-release-release-lunar-controller_manager_tests-0.12.0-0"

inherit catkin
