# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "rosserial for Arduino/AVR platforms."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "arduino-core catkin-native message-generation message-runtime rospy rosserial-client rosserial-msgs"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/kinetic/rosserial_arduino/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d6405f3686c9837797c5a4c9513803ef"
SRC_URI[sha256sum] = "d395dc434acca8547bd966ca8428a28bd147333be5f7f3e02b251c5eb1ba1af8"
S = "${WORKDIR}/rosserial-release-release-kinetic-rosserial_arduino-0.7.7-0"

inherit catkin
