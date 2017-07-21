# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A Python and C++ implementation of the LZ4 streaming format.  Large data     str"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin lz4"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/roslz4/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cdd1339e4f3691d41189e3f48a3927e6"
SRC_URI[sha256sum] = "aaa491987e800afb424fe0a59376d90b929513e88be18b1d008484c92700a375"
S = "${WORKDIR}/ros_comm-release-release-lunar-roslz4-1.13.0-0"

inherit catkin
