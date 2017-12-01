# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_nav_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geographic-msgs geometry-msgs marti-common-msgs message-generation message-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/lunar/marti_nav_msgs/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cbdf63f726f24c533cbd320ec1baf3db"
SRC_URI[sha256sum] = "3d3a6c73c06e37bf581c2bba66d8b569bbc1ef2c97ec8034fccb2fe00774b4fd"
S = "${WORKDIR}/marti_messages-release-release-lunar-marti_nav_msgs-0.4.0-0"

inherit catkin
