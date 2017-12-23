# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "mavros_msgs defines messages for ."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native geographic-msgs geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/mavros_msgs/0.21.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9989505583577df09cfad21e4e3a28ef"
SRC_URI[sha256sum] = "ce001de2e5f23f492512bcd8bee839a71bc21f01f30a29e61bc8a33128160c91"
S = "${WORKDIR}/mavros-release-release-lunar-mavros_msgs-0.21.5-0"

inherit catkin
