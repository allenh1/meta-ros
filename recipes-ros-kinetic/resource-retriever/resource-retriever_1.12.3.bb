# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package retrieves data from url-format files such as http://,    ftp://, pa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=18;endline=18;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native curl python-rospkg rosconsole roslib"
SRC_URI = "https://github.com/ros-gbp/resource_retriever-release/archive/release/kinetic/resource_retriever/1.12.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "54d50ad8697158a71ebbfc7d8b1e1392"
SRC_URI[sha256sum] = "7f5525a0fbcb897d2035fe1f061148313b6fef9d6c64142174aeb09378ba8d4c"
S = "${WORKDIR}/resource_retriever-release-release-kinetic-resource_retriever-1.12.3-0"

inherit catkin
