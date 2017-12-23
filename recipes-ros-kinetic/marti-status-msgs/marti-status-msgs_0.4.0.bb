# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_status_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/kinetic/marti_status_msgs/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "78e1a22d91dcdcf1c9b70b803806842f"
SRC_URI[sha256sum] = "ab212f9572b96a32fe38d804492484ddce1bbdf30d8eee4746f9a0cdb012040a"
S = "${WORKDIR}/marti_messages-release-release-kinetic-marti_status_msgs-0.4.0-0"

inherit catkin
