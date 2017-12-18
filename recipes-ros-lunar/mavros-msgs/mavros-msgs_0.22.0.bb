# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "mavros_msgs defines messages for ."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "catkin-native catkin geographic-msgs geometry-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/lunar/mavros_msgs/0.22.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "161f68e61ed8e971fe1d466c3c2bd1e7"
SRC_URI[sha256sum] = "301f71964bf6920893af36405a0f84703f74924a0c10f4e4c7129b8958f83fb6"
S = "${WORKDIR}/mavros-release-release-lunar-mavros_msgs-0.22.0-0"

inherit catkin
