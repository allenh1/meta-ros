# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Defines the messages that are used to communicate with the
    p2os_driver packa"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=1;endline=1;md5=2c2a99ced09b176dc93fd6dc87ac26c0"

DEPENDS = "catkin message_generation message_runtime std_msgs"
SRC_URI = "https://github.com/allenh1/p2os-release/archive/release/lunar/p2os_msgs/2.0.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9b9e47d75453218287679992737a9f35"
SRC_URI[sha256sum] = "3296fe577807a63ffa98082be3d683b864f4695a6542a060056d52e25a57de50"
S = "${WORKDIR}/${ROS_SP}"

inherit catkin
