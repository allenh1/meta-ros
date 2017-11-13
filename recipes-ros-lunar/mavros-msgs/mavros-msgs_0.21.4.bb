# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "mavros_msgs defines messages for ."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native geographic-msgs geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/mavros_msgs/0.21.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "748f1f65bc04fe9331f7a7fc62fa7732"
SRC_URI[sha256sum] = "f24f24a9d5be593cf7e688479e5f014661d8aa28f70f8bafda314399cd5c2e1a"
S = "${WORKDIR}/mavros-release-release-lunar-mavros_msgs-0.21.4-0"

inherit catkin
