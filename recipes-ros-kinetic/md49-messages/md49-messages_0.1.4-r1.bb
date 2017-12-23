# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The md49_messages package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/Scheik/md49_base_controller-release/archive/release/kinetic/md49_messages/0.1.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "4d16cdb0152e8cf6f230f3efff0aeda2"
SRC_URI[sha256sum] = "49e61cb56b9a3f9cd322d8692107ba9a7f6cfa0182fb7d1923b52cb271092219"
S = "${WORKDIR}/md49_base_controller-release-release-kinetic-md49_messages-0.1.4-1"

inherit catkin
