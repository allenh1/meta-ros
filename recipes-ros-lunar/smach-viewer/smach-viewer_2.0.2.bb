# Copyright 2017 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The smach viewer is a GUI that shows the state of hierarchical     SMACH state m"
AUTHOR = "OSRF"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "catkin graphviz rostest smach-msgs smach-ros wxpython"
SRC_URI = "https://github.com/jbohren/executive_smach_visualization-release/archive/release/lunar/smach_viewer/2.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cf26b05a254318bbc66da2b4f6a6af11"
SRC_URI[sha256sum] = "41d5f36caf445a1f7f2c3759ba93489e5fa79f3d0311b6e2df9577fc2b6d59bd"
S = "${WORKDIR}/executive_smach_visualization-release-release-lunar-smach_viewer-2.0.2-0"

inherit catkin
