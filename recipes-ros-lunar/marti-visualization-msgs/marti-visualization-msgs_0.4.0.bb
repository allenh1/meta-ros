# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_visualization_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin geometry-msgs message-generation message-runtime sensor-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/lunar/marti_visualization_msgs/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "ff7f12e9abc5edb243ee84ca212acb66"
SRC_URI[sha256sum] = "7272e9f69639c51283198742377c65d94711298949551d518f0313c384c71485"
S = "${WORKDIR}/marti_messages-release-release-lunar-marti_visualization_msgs-0.4.0-0"

inherit catkin
