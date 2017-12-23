# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The log_server package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=2c00b8d2854109dbebef7818b4dae1e2"

DEPENDS = "catkin-native message-generation python-expiringdict rosgraph-msgs rospy"
SRC_URI = "https://github.com/easymov/log_server-release/archive/release/kinetic/log_server/0.1.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e84c01921bd36b0186152095d18e4f24"
SRC_URI[sha256sum] = "991314fdd4bebf07c71d9a0c8c5abf4c18d003412741ae670175a7b81b4935ac"
S = "${WORKDIR}/log_server-release-release-kinetic-log_server-0.1.4-1"

inherit catkin
