# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "None"
AUTHOR = "OSRF"
SECTION = "devel"
LIC_FILES_CHKSUM = file://package.xml;beginline=9;endline=9;md5=23f8de2430b349800266ded71351769e"

DEPENDS = "boost catkin class_loader cmake_modules rosconsole roslib tinyxml"
SRC_URI = "https://github.com/ros-gbp/pluginlib-release/archive/release/lunar/pluginlib/1.10.5-0.tar.gz";downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7b42817fee923ffdad967b6027cacece"
SRC_URI[sha256sum] = "52757ac820e93b77a2151428c44099b7b0a995d7e1480a99105679e944f83daa"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
