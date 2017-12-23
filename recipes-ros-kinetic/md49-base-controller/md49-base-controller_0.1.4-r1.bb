# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The md49_base_controller package"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs md49-messages md49-serialport message-generation message-runtime roscpp rospy std-msgs"
SRC_URI = "https://github.com/Scheik/md49_base_controller-release/archive/release/kinetic/md49_base_controller/0.1.4-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "3c4aee808164a75300f525050938f5f8"
SRC_URI[sha256sum] = "b67dddd94b6a93f0c6fc9515a3f692344278e7c7e87a47171e9fb2617530a8ca"
S = "${WORKDIR}/md49_base_controller-release-release-kinetic-md49_base_controller-0.1.4-1"

inherit catkin
