# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains messages specific to the Neuronics Katana arm."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPL-1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=162b49cfbae9eadf37c9b89b2d2ac6be"

DEPENDS = "actionlib-msgs catkin-native message-generation message-runtime sensor-msgs"
SRC_URI = "https://github.com/uos-gbp/katana_driver-release/archive/release/lunar/katana_msgs/1.1.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "8b2b652127be4e095ee98745af24aa9e"
SRC_URI[sha256sum] = "ede3c57e8d0704ad0224dadf3821eb9ab18e145319303fa2f5a83ddbd062720f"
S = "${WORKDIR}/katana_driver-release-release-lunar-katana_msgs-1.1.2-0"

inherit catkin
