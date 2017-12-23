# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains messages specific to the Neuronics Katana arm."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "actionlib-msgs catkin-native message-generation message-runtime sensor-msgs"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/kinetic/katana_msgs/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "0030e4ad2a12b7d2fa0c2907cc95f963"
SRC_URI[sha256sum] = "1506075d75625aa7ccc7cbf70f61f4c865b450319d2f4db60929b2715a4f3f00"
S = "${WORKDIR}/katana_driver-release-release-kinetic-katana_msgs-1.1.2-0"

inherit catkin
