# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The smach viewer is a GUI that shows the state of hierarchical     SMACH state m"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin-native graphviz rostest smach-msgs smach-ros wxpython"
SRC_URI = "https://github.com/jbohren/executive_smach_visualization-release/archive/release/kinetic/smach_viewer/2.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "bdc86f8cc9e6e661d8b3080c076a4e63"
SRC_URI[sha256sum] = "8473346bc221e0342a8d18c5f42a2fbf0b4f0bdd195bceed01d97bc121d1e26d"
S = "${WORKDIR}/executive_smach_visualization-release-release-kinetic-smach_viewer-2.0.2-0"

inherit catkin
