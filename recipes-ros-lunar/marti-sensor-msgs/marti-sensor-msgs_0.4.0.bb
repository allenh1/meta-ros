# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_sensor_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native geometry-msgs message-generation message-runtime"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/lunar/marti_sensor_msgs/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f42af1a137b9eeb35ab1dd7974049acb"
SRC_URI[sha256sum] = "e4416c7dfc1c7bc6300772b24df6f70fb9e26bf09da329853605177dacd6c079"
S = "${WORKDIR}/marti_messages-release-release-lunar-marti_sensor_msgs-0.4.0-0"

inherit catkin
