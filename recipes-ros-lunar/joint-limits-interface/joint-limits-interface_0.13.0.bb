# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface for enforcing joint limits."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hardware-interface liburdfdom-dev roscpp urdf"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/joint_limits_interface/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8c37f28eb37983b344ee38cf0f536589"
SRC_URI[sha256sum] = "2f62abbb12c13857745271a6ebe09c489376982a80b6349c666156b19a48b7e9"
S = "${WORKDIR}/ros_control-release-release-lunar-joint_limits_interface-0.13.0-0"

inherit catkin
