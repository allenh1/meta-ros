# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Turtlebot messages, services and actions"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime sensor-msgs std-msgs std-srvs"
SRC_URI = "https://github.com/turtlebot-release/turtlebot_msgs-release/archive/release/kinetic/turtlebot_msgs/2.2.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "22910eda01f90f1c2d51bba12bf88f2b"
SRC_URI[sha256sum] = "5bdf6f93d6ec13fe89b3798333660c33d41736728ff3907e3f4b323a716618b1"
S = "${WORKDIR}/turtlebot_msgs-release-release-kinetic-turtlebot_msgs-2.2.1-0"

inherit catkin
