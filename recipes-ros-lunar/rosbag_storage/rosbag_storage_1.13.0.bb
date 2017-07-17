# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This is a set of tools for recording from and playing back ROS
    message witho"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=;endline=;md5="

DEPENDS = "boost bzip2 catkin cpp_common libconsole-bridge-dev roscpp_serialization roscpp_traits roslz4 rostime"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosbag_storage/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e4290f4c218c8ccc28d2da04edef924c"
SRC_URI[sha256sum] = "472da59307a47547c95397dfb6ab76d31518ed736089ea7dec699a7892079f3e"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
