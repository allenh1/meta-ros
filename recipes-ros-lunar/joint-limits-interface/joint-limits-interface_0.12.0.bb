# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface for enforcing joint limits."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin hardware-interface liburdfdom-dev roscpp urdf"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/joint_limits_interface/0.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "66e43b87f4d67fe8a6b00383e6a304c0"
SRC_URI[sha256sum] = "e0b168b8e8d281021b9bfc66c6e94578e495a88bc12f92f62a45cfad15ccb7ac"
S = "${WORKDIR}/ros_control-release-release-lunar-joint_limits_interface-0.12.0-0"

inherit catkin
