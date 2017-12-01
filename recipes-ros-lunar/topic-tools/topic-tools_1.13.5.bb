# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Tools for directing, throttling, selecting, and otherwise messing with     ROS t"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native cpp-common message-generation message-runtime rosconsole roscpp rostest rostime rosunit std-msgs xmlrpcpp"
SRC_URI = "https://github.com/ros-gbp/ros_comm-release/archive/release/lunar/topic_tools/1.13.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c21dcf59559f9cc44a21711b0435709a"
SRC_URI[sha256sum] = "c313c9c31b593370457cb30220a47e1f6e15fe347dc9b80113a8e9dda071245b"
S = "${WORKDIR}/ros_comm-release-release-lunar-topic_tools-1.13.5-0"

inherit catkin
