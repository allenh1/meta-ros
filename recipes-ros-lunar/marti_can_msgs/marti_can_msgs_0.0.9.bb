# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_can_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=31c1244991f1e55c366d1e977d4ddca8"

DEPENDS = "catkin message_generation message_runtime std_msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/lunar/marti_can_msgs/0.0.9-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "936041ef15f51993dcd9bd3d17bf8260"
SRC_URI[sha256sum] = "aa4533d4d7c409138e5d0bfe32f76653d49149023368318b4e8e23febed25910"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
