# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Messages for automatic topic configuration using rosserial."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin message-generation message-runtime"
SRC_URI = "https://github.com/ros-gbp/rosserial-release/archive/release/lunar/rosserial_msgs/0.7.7-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "853c9f6e230c4a076653900bc4292a37"
SRC_URI[sha256sum] = "5bb07baec11b2845058d4e8a9d85d3f3c8ab21a505a370201c64bd28828c2b61"
S = "${WORKDIR}/rosserial-release-release-lunar-rosserial_msgs-0.7.7-0"

inherit catkin
