# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package which implements capabilities, including code to parse capability interf"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "bondpy catkin message-generation message-runtime nodelet python-pyyaml roslaunch rospy rostest std-msgs std-srvs"
SRC_URI = "https://github.com/ros-gbp/capabilities-release/archive/release/lunar/capabilities/0.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "b7f36d1231f63f5fca67e331c6c542ee"
SRC_URI[sha256sum] = "b1ec88895ad45d5aa4037585a4be477757956978e9368726d6d996f8c78ff8f9"
S = "${WORKDIR}/capabilities-release-release-lunar-capabilities-0.2.0-0"

inherit catkin
