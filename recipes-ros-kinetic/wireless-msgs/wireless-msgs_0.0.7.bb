# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages for describing aspects of a wireless network, connection, etc."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/clearpath-gbp/wireless-release/archive/release/kinetic/wireless_msgs/0.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c44e7fd2e089a030f9d684df6b48f48"
SRC_URI[sha256sum] = "640e622ca48d718ae7f3acf0c250c7768bee747bc9ecdcd9ed71391c63d735a4"
S = "${WORKDIR}/wireless-release-release-kinetic-wireless_msgs-0.0.7-0"

inherit catkin
