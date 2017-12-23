# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This is a set of tools for recording from and playing back ROS     message witho"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost bzip2 catkin-native cpp-common console-bridge roscpp-serialization roscpp-traits roslz4 rostime"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/kinetic/rosbag_storage/1.12.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9a1e894608f1fe6825c76e813c23d5b8"
SRC_URI[sha256sum] = "0f1e0e3fb6286c5973bcd46ad64533910dc8fd2d97e07db9791c628fb0980d5f"
S = "${WORKDIR}/ros_comm-release-release-kinetic-rosbag_storage-1.12.12-0"

inherit catkin
