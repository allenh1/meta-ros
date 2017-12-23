# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages for use with robot_controllers framework."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/fetchrobotics-gbp/robot_controllers-release/archive/release/kinetic/robot_controllers_msgs/0.5.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3ee775b3a6c53b29d19fa85dc8b859a3"
SRC_URI[sha256sum] = "9964d5d08e9c46f13870d07658f54ef869ad0e2e79f3a8fd5cc82c781774f96d"
S = "${WORKDIR}/robot_controllers-release-release-kinetic-robot_controllers_msgs-0.5.2-0"

inherit catkin
