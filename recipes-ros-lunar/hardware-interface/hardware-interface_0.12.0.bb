# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Hardware Interface base class."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin roscpp"
SRC_URI = "https://github.com/ros-gbp/ros_control-release/archive/release/lunar/hardware_interface/0.12.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c46c03fe3fe6e93703ddec43a2e1058d"
SRC_URI[sha256sum] = "6d3d85fec6ee147abae45357005db2ebcb6b628c1dd167e5421f92d092e5ef5f"
S = "${WORKDIR}/ros_control-release-release-lunar-hardware_interface-0.12.0-0"

inherit catkin
