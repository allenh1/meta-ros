# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This is a set of tools for recording from and playing back ROS     message witho"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost bzip2 catkin-native cpp-common console-bridge roscpp-serialization roscpp-traits roslz4 rostime"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/rosbag_storage/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9b6e4195149063603cbe3eb39bb4c567"
SRC_URI[sha256sum] = "04d63df37ff1622b8237bb7c0ad625061e4cbd5b96c731322abcdf6d4f847ae5"
S = "${WORKDIR}/ros_comm-release-release-lunar-rosbag_storage-1.13.5-0"

inherit catkin
