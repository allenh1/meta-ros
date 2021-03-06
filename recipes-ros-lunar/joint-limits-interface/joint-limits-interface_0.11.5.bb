# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface for enforcing joint limits."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hardware-interface liburdfdom-dev roscpp urdf"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/joint_limits_interface/0.11.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "76719876e51870cc595d586675cd3a34"
SRC_URI[sha256sum] = "7716b3b8b26ad7d068ffd773a07e016a9faff640050685fb4f67dd330deeb769"
S = "${WORKDIR}/ros_control-release-release-lunar-joint_limits_interface-0.11.5-0"

inherit catkin
