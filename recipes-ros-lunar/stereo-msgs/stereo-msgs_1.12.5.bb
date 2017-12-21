# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "stereo_msgs contains messages specific to stereo processing, such as disparity i"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros-gbp/common_msgs-release/archive/release/lunar/stereo_msgs/1.12.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9c66b7060f07b8f2cfb7c1e1932d52ce"
SRC_URI[sha256sum] = "bdb98c355418a6eb93a6fb2365b7303fb50cc32b29f653a5ac66653684c104dd"
S = "${WORKDIR}/common_msgs-release-release-lunar-stereo_msgs-1.12.5-0"

inherit catkin
