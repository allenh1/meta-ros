# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages specific to Puma."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/clearpath-gbp/puma_motor_driver-release/archive/release/kinetic/puma_motor_msgs/0.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3dc74ef11dbf20b07630d08b7c094da3"
SRC_URI[sha256sum] = "2e0e778fc4066927acc564f167b321c407f71d8f6ea93c119d8377ba339c6873"
S = "${WORKDIR}/puma_motor_driver-release-release-kinetic-puma_motor_msgs-0.1.2-0"

inherit catkin
