# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Interface for enforcing joint limits."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native hardware-interface liburdfdom-dev roscpp urdf"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/kinetic/joint_limits_interface/0.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d684c6064a1a1e202c47b94d52d51e9b"
SRC_URI[sha256sum] = "5e88dfe9d3071165c505c9e0818b95b45365a4eda9563f7606b9fda3fcf6916c"
S = "${WORKDIR}/ros_control-release-release-kinetic-joint_limits_interface-0.13.0-0"

inherit catkin
