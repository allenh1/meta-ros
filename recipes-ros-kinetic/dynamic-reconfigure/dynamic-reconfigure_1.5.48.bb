# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This unary stack contains the dynamic_reconfigure package which provides a means"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost catkin-native message-generation message-runtime roscpp roscpp-serialization roslib rospy rosservice rostest std-msgs"
SRC_URI = "https://github.com/ros-gbp/dynamic_reconfigure-release/archive/release/kinetic/dynamic_reconfigure/1.5.48-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "7b28af4019888f74b334687af5cdac18"
SRC_URI[sha256sum] = "ce9303a71a6489f1fa2bf2ac95cc63ba13e4053f54085242a1b8014feb466658"
S = "${WORKDIR}/dynamic_reconfigure-release-release-kinetic-dynamic_reconfigure-1.5.48-0"

inherit catkin
