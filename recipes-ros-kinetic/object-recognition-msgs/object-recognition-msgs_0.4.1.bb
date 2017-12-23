# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Object_recognition_msgs contains the ROS message and the actionlib definition us"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs message-generation message-runtime sensor-msgs shape-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/object_recognition_msgs-release/archive/release/kinetic/object_recognition_msgs/0.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "30d7193d6de212dbcd50028ef44cde3a"
SRC_URI[sha256sum] = "a04086c726f66fbdde92aada134688305fe3a446ade8f8cf2f7d6ca78f07a51a"
S = "${WORKDIR}/object_recognition_msgs-release-release-kinetic-object_recognition_msgs-0.4.1-0"

inherit catkin
