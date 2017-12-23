# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The core rosbridge package, repsonsible for interpreting JSON andperforming     "
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime python-bson python-imaging roscpp rosgraph rospy rosservice rostopic std-msgs"
SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/kinetic/rosbridge_library/0.8.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "920c303a6f5e5dbaff0334436a121e2e"
SRC_URI[sha256sum] = "a626fe01e4f4154eaa7bb9f613b5ac89618b96877c87bac4e68c6565420e8008"
S = "${WORKDIR}/rosbridge_suite-release-release-kinetic-rosbridge_library-0.8.6-0"

inherit catkin
