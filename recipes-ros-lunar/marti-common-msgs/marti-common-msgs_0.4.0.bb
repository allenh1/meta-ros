# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "marti_common_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "lunar"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native catkin message-generation message-runtime std-msgs"
SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/lunar/marti_common_msgs/0.4.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "670937b1923d94ced2928f9bb27c04d8"
SRC_URI[sha256sum] = "ae1fa5f8836f02dc10ce0fe1ffc61337222baab288f4850caa1adab710d0cae6"
S = "${WORKDIR}/marti_messages-release-release-lunar-marti_common_msgs-0.4.0-0"

inherit catkin
