# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "EusLisp client for ROs Robot Operating System."
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "actionlib actionlib-msgs actionlib-tutorials angles catkin-native coreutils dynamic-reconfigure euslisp geneus geometry-msgs jskeus message-generation message-runtime mk rosbash rosbuild roscpp roslang rosmsg rosnode rospack rostest rostopic sensor-msgs std-msgs std-srvs tf tf2-ros visualization-msgs"
SRC_URI = "https://github.com/tork-a/jsk_${PN}-release/archive/release/kinetic/${PN}/1.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1fdb6f1ae5b7eda47a78135da1b5a9c6"
SRC_URI[sha256sum] = "4a180c4602ba4945b9d26f78904f25f3a9f09f38e27ec9b214f5dd47c4d0be39"
S = "${WORKDIR}/jsk_${PN}-release-release-kinetic-${PN}-1.6.3-0"

inherit catkin
