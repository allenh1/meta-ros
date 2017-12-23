# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages used by the rocon scheduler."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "catkin-native message-generation message-runtime rocon-std-msgs std-msgs uuid-msgs"
SRC_URI = "https://github.com/yujinrobot-release/rocon_msgs-release/archive/release/kinetic/scheduler_msgs/0.9.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "16022e67ec51fab23ea99a8f85779ba6"
SRC_URI[sha256sum] = "b60dd96065e4ed9942d5cfdbdd964eb0888dbc451720148e3854b2a6c44f77ab"
S = "${WORKDIR}/rocon_msgs-release-release-kinetic-scheduler_msgs-0.9.0-1"

inherit catkin
