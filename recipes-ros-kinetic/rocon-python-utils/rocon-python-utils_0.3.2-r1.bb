# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python system and ros utilities."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native python-catkin-pkg-native python-rospkg rocon-std-msgs roslib rospy rostest"
SRC_URI = "https://github.com/yujinrobot-release/rocon_tools-release/archive/release/kinetic/rocon_python_utils/0.3.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "796a9ed9c4ca73dc9e288d10dbb4eecb"
SRC_URI[sha256sum] = "ed10061311156b7194caade3b6f27493ef7652f4c3b4e498867bc3815afe23b0"
S = "${WORKDIR}/rocon_tools-release-release-kinetic-rocon_python_utils-0.3.2-1"

inherit catkin
