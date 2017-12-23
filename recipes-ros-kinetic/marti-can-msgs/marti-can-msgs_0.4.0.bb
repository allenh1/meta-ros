# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_can_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/kinetic/marti_can_msgs/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "209d82f7ba8c4ea87bc2a7062a2e850c"
SRC_URI[sha256sum] = "1827995d1d9151a6c3c75d690527a01baf6aecc64d1c9080b8e7a2eca7f9edcc"
S = "${WORKDIR}/marti_messages-release-release-kinetic-marti_can_msgs-0.4.0-0"

inherit catkin
