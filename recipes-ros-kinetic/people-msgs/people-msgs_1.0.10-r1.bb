# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages used by nodes in the people stack."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/OSUrobotics/people-release/archive/release/kinetic/people_msgs/1.0.10-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "68da75878ea564748a079a55a5763d80"
SRC_URI[sha256sum] = "ffec243cef1a17a14f23fab824a97d455f73d56cea2cbfec55ae23bcf214ad5d"
S = "${WORKDIR}/people-release-release-kinetic-people_msgs-1.0.10-1"

inherit catkin
