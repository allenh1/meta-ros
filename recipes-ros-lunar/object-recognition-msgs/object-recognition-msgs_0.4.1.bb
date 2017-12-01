# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Object_recognition_msgs contains the ROS message and the actionlib definition us"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib-msgs catkin-native geometry-msgs message-generation message-runtime sensor-msgs shape-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/object_recognition_msgs-release/archive/release/lunar/object_recognition_msgs/0.4.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "18b2d32fce1978cfa157df0b8943e1c6"
SRC_URI[sha256sum] = "acbf1a2850fae533f454dd9371dfaf59780e8779a49245faf88ead3893444211"
S = "${WORKDIR}/object_recognition_msgs-release-release-lunar-object_recognition_msgs-0.4.1-0"

inherit catkin
