# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package retrieves data from url-format files such as http://,    ftp://, pa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "catkin curl python-rospkg rosconsole roslib"
SRC_URI = "https://github.com/ros-gbp/resource_retriever-release/archive/release/lunar/resource_retriever/1.12.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ca3b2aefb4904530c5f72115bb0032cd"
SRC_URI[sha256sum] = "5761b994cc975c1d4fa51c6b0110a0b9243d98b1617bc94d45fdd56672a9535d"
S = "${WORKDIR}/resource_retriever-release-release-lunar-resource_retriever-1.12.3-0"

inherit catkin
